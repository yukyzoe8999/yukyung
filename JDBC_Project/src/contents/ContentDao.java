package contents;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ContentDao {
	private Connection con;
	private PreparedStatement pstm;
	private ResultSet rs;

	public ContentDao() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/study?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String dbID = "root";
			String dbPass = "woojin7929M";
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(dbURL, dbID, dbPass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getDate() {
		String SQL = "select now()";
		try {
			PreparedStatement pstm = con.prepareStatement(SQL);
			rs = pstm.executeQuery();
			if (rs.next()) {
				return rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ""; // DB오류
	}

	public int getNext() {
		String SQL = "select contentID from contents order by contentID desc";
		try {
			PreparedStatement pstm = con.prepareStatement(SQL);
			rs = pstm.executeQuery();
			if (rs.next()) {
				return rs.getInt(1) + 1;
			}
			return 1; // 글이 하나도 없으면 1번

		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; // DB오류
	}

	public int write(String Title, String userID, String Content) { // 글 입력
		String SQL = "INSERT INTO CONTENTS VALUES(?,?,?,?,?,?)";// 글쓰기
		try {
			pstm = con.prepareStatement(SQL);
			pstm.setInt(1, getNext());
			pstm.setString(2, Title);
			pstm.setString(3, userID);
			pstm.setString(4, getDate());
			pstm.setString(5, Content);
			pstm.setInt(6, 1);
			return pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	public ArrayList<Contents> getList(int pageNumber) { // 게시글 리스트
		String SQL = "select *from contents where contentID < ? and Available = 1 order by contentID desc limit 10"; // 아무것도 안넣거나 desc대신 asc																														 
		
		ArrayList<Contents> list = new ArrayList<Contents>();
		
		try {
			PreparedStatement pstm = con.prepareStatement(SQL);
			//System.out.println("GET NEXT: "+ getNext()+"!!!!!!!");
			pstm.setInt(1, getNext() - ((pageNumber - 1) * 10));
			rs = pstm.executeQuery();
			while (rs.next()) {
				Contents ct = new Contents();
				ct.setContentID(rs.getInt(1));
				ct.setTitle(rs.getString(2));
				ct.setUserID(rs.getString(3));
				ct.setDate(rs.getString(4));
				ct.setContent(rs.getString(5));
				ct.setAvailable(rs.getInt(6));
				list.add(ct);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public boolean nextPage(int pageNumber) {// 페이징 처리
		String SQL = "select *from contents where contentID < ? and Available = 1";

		try {
			//System.out.println("GET NEXT: "+ getNext()+"!!!!!!!");
			PreparedStatement pstm = con.prepareStatement(SQL);
			pstm.setInt(1, getNext() - (pageNumber - 1) * 10);
			rs = pstm.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public Contents getContents(int contentID) {//글 보기
		String SQL = "select *from contents where contentID =?";

		try {
			
			PreparedStatement pstm = con.prepareStatement(SQL);
			pstm.setInt(1, contentID);
			rs = pstm.executeQuery();
			if (rs.next()) {
				Contents ct = new Contents();
				ct.setContentID(rs.getInt(1));
				ct.setTitle(rs.getString(2));
				ct.setUserID(rs.getString(3));
				ct.setDate(rs.getString(4));
				ct.setContent(rs.getString(5));
				ct.setAvailable(rs.getInt(6));
				return ct;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null; //오류
	}
	public int update(int ContentID, String Title, String Content) {//글 수정
		String SQL = "UPDATE CONTENTS SET Title = ?, Content = ? WHERE ContentID = ?";

		try {		
			//System.out.println("ContentID: "+ContentID +"입니다.");
			PreparedStatement pstm = con.prepareStatement(SQL);
			pstm.setString(1, Title);
			pstm.setString(2, Content);
			pstm.setInt(3, ContentID);
			return pstm.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	} 
	return -1; //DB오류
}
	public int delete(int ContentID) {
		String SQL = "UPDATE CONTENTS SET Available = 0 WHERE ContentID = ?";

		try {		
			PreparedStatement pstm = con.prepareStatement(SQL);
			pstm.setInt(1, ContentID);
			return pstm.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	} 
	return -1; //DB오류
		
		
	}
}