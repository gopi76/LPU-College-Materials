import java.nio.file.*;  // Feb 27, 2024 


class Test {
	public static void main(String args[]) throws Exception  {

	/*	Path  src = Paths.get("C:\\Users\\Dell\\Desktop");
		Path  dst = Paths.get("C:\\Users\\Dell\\Desktop\\Gopi Krishna\\Certificates\\10th\\xyz.txt");
		//Files.move(src, dst);

		Stream<Path> str  = Files.walk(src);
		str.forEach(p -> System.out.println(p)); */

		String uname = sc.nextLine();
		String curr = sc.nextLine();
		String npass = sc.nextLine();

		PreparedStatement ps = con.prepareStatement("Select * from login where user = ? ");

		ps.setString(1, uname);

		ResultSet.executeQuery();

		if(!rs.next()) { 
		} else {
			String password = rs.getString(2);
		}





	}
}