package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.ineuron.dto.Student;
import in.ineuron.util.JDBCUtil;

public class IStudentDaoImpl implements IStudentDao {

	private Connection connection = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	@Override
	public String save(Student student) {
		String sql = "insert into students (sname,sage,saddr) values(?,?,?)";

		try {
			connection = JDBCUtil.getConnection();

			if (connection != null) {

				psmt = connection.prepareStatement(sql);

				if (psmt != null) {
					psmt.setString(1, student.getSname());
					psmt.setInt(2, student.getSage());
					psmt.setString(3, student.getSaddr());
				}

				int rowsAffected = psmt.executeUpdate();
				System.out.println("rows affected::" + rowsAffected);
				if (rowsAffected == 1) {
					return "success";
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return "failed";
		}

		return "failed";

	}

	@Override
	public Student findById(Integer sid) {
		String sql = "select*from students where sid=?";

		Student student = null;
		try {
			connection = JDBCUtil.getConnection();

			if (connection != null) {

				psmt = connection.prepareStatement(sql);

				if (psmt != null) {
					psmt.setInt(1, sid);
				}

				if (psmt != null) {
					rs = psmt.executeQuery();
					if (rs.next()) {
						student = new Student();

						student.setSid(rs.getInt(1));
						student.setSname(rs.getString(2));
						student.setSage(rs.getInt(3));
						student.setSaddr(rs.getString(4));
					}

				}
				int rowsAffected = psmt.executeUpdate();
				System.out.println("rows affected::" + rowsAffected);
				if (rowsAffected == 1) {

				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return student;

	}

	@Override
	public String updateById(Student student) {
		String sql = "update students set sname=?,sage=?,saddr=? where sid=?";

		try {
			connection = JDBCUtil.getConnection();

			if (connection != null) {

				psmt = connection.prepareStatement(sql);

				if (psmt != null) {
					psmt.setString(1, student.getSname());
					psmt.setInt(2, student.getSage());
					psmt.setString(3, student.getSaddr());
					psmt.setInt(4, student.getSid());

				}
				if (psmt != null) {
					int rowsAffected = psmt.executeUpdate();
					System.out.println("rows affected::" + rowsAffected);
					if (rowsAffected == 1) {
						return "success";
					}
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return "failed";
		}

		return "failed";

	}

	@Override
	public String deleteById(Integer sid) {
		String sql = "delete from students where sid=?";

		try {
			connection = JDBCUtil.getConnection();

			if (connection != null) {

				psmt = connection.prepareStatement(sql);

				if (psmt != null) {
					psmt.setInt(1, sid);

				}
				if (psmt != null) {
					int rowsAffected = psmt.executeUpdate();
					System.out.println("rows affected::" + rowsAffected);
					if (rowsAffected == 1) {
						return "success";
					}
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return "failed";
		}

		return "failed";

	}

}
