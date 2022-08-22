package com.vti.frontend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.Position.PositionName;

public class demo1 {
	public static void main(String[] args) {

//+---------------khởi tạo Department---------+

		Department dpart1 = new Department();
		dpart1.id = 1;
		dpart1.name = "sale";

		Department dpart2 = new Department();
		dpart2.id = 2;
		dpart2.name = "Maketing";

		Department dpart3 = new Department();
		dpart3.id = 3;
		dpart3.name = "PR";

// +---------------khởi tạo Position ---------+

		Position position1 = new Position();
		position1.id = 1;
		position1.name = PositionName.Scrum_Master;

		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.Scrum_Master;

		Position position3 = new Position();
		position2.id = 3;
		position2.name = PositionName.Test;

// +---------------khởi tạo Account ---------+

		Account account1 = new Account();
		account1.id = 1;
		account1.email = "hocvien1@gmail.com";
		account1.username = " hocvien1 ";
		account1.fullname = "hoc vien 1";
		account1.department = dpart1;
		account1.position = position1;
		account1.createDate = LocalDate.of(2021, 6, 10);

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "hocvien2@gmail.com";
		account2.username = " hocvien2 ";
		account2.fullname = "hoc vien 2";
		account2.department = dpart2;
		account2.position = position2;
		account2.createDate = LocalDate.of(2022, 6, 10);

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "hocvien3@gmail.com";
		account3.username = " hocvien3 ";
		account3.fullname = "hoc vien 3";
		account3.department = dpart3;
		account3.position = position3;
		account3.createDate = LocalDate.of(2020, 6, 10);

		// +---------------khởi tạo Group ---------+

		Group group1 = new Group();
		group1.id = 1;
		group1.name = "bong da";
		group1.creator = account1;
		group1.createdate = LocalDate.of(2021, 3, 21);
		group1.accounts = new Account[] { account1, account3 };

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Guitar";
		group2.creator = account2;
		group2.createdate = LocalDate.of(2022, 3, 21);
		group2.accounts = new Account[] { account2, account3 };

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "boi";
		group3.creator = account1;
		group3.createdate = LocalDate.of(2020, 3, 21);
		group3.accounts = new Account[] { account1, account2, account3 };

		// +---------------khởi tạo Group Account ---------+

//		Group[] graccount1 = new Group[] { group1, group3 };
//		account1.groups = graccount1;

		Group[] graccount2 = new Group[] { group1 };
		account2.groups = graccount2;

		Group[] graccount3 = new Group[] { group1, group2, group3 };
		account3.groups = graccount3;

//+------------------Exercise 1 (Optional): Flow Control----------------+
		// +------------------ IF ----------------+
		// +------------------ Question 1 ----------------+
//		Kiểm tra account thứ 2
//		Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
//		"Nhân viên này chưa có phòng ban"
//		Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ..."

		System.out.println("+--------------Question 1-----------------+");
		if (account2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là : " + account2.department.name);
		}

		// +------------------ Question 2 ----------------+
//		Kiểm tra account thứ 2
//		Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//		Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
//		này là Java Fresher, C# Fresher"
//		Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
//		quan trọng, tham gia nhiều group"
//		Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
//		người hóng chuyện, tham gia tất cả các group"

		System.out.println("+----------------Question 2---------------+");
		if (account2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else if (account2.groups.length == 1 || account2.groups.length == 2) {
			System.out.println("Group của nhân viên	này là Java Fresher, C# Fresher");
		} else if (account2.groups.length == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		} else {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}

		// +------------------ Question 3 ----------------+

		System.out.println("+---------------Question 3----------------+");
		System.out.println(account2.department == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là : " + account2.department.name);

		// +------------------ Question 4 ----------------+
//		Sử dụng toán tử ternary để làm yêu cầu sau:
//			Kiểm tra Position của account thứ 1
//			Nếu Position = Dev thì in ra text "Đây là Developer"
//			Nếu không phải thì in ra text "Người này không phải là Developer"
//			
		System.out.println("+---------------Question 4----------------+");
		System.out.println(
				account1.position.name == PositionName.Dev ? "Đây là Developer" : "Người này không phải là Developer");

		// +------------------ SWITCH CASE ----------------+
		// +------------------ Question 5 ----------------+
//		Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//			Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//			Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//			Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//			Còn lại in ra "Nhóm có nhiều thành viên"
		System.out.println("+---------------Question 5----------------+");
		int slacgroup1 = group1.accounts.length;
		switch (slacgroup1) {
		case 0:
			System.out.println("Nhân viên này chưa có group");
			break;
		case 1:
			System.out.println("Group của nhân viên	này là Java Fresher, C# Fresher");
			break;
		case 2:
			System.out.println("Group của nhân viên	này là Java Fresher, C# Fresher");
			break;
		case 3:
			System.out.println("Nhóm có ba thành viên");
			break;
		case 4:
			System.out.println("Group của nhân viên	này là Java Fresher, C# Fresher");
			break;

		default:
			System.out.println("Nhóm có nhiều thành viên");
			break;
		}

		// +------------------ Question 6 ----------------+

		System.out.println("+---------------Question 6----------------+");

		int slgraccount2 = account3.groups.length;
		switch (slgraccount2) {

		case 1:
			System.out.println("Group của nhân viên	này là Java Fresher, C# Fresher");
			break;
		case 2:
			System.out.println("Group của nhân viên	này là Java Fresher, C# Fresher");
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
		default:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			break;
		}

		// +------------------ Question 7 ----------------+
		System.out.println("+---------------Question 7----------------+");

		switch (account1.position.name) {
		case Dev:
			System.out.println("Đây là Developer");
			break;

		default:
			System.out.println("Người này không phải là Developer");
			break;
		}
		// +------------------ FOREACH ----------------+
		// +------------------ Question 8 ----------------+
		System.out.println("+---------------Question 8----------------+");

		Account[] inforaccount = new Account[] { account1, account2, account3 };

		for (Account acc : inforaccount) {
			System.out.println("email : " + acc.email);
			System.out.println("FullName : " + acc.fullname);
			System.out.println("department : " + acc.department.name);
			System.out.println("+++++++++++++++++++++++++++++++++++");
		}

		// +------------------ Question 9 ----------------+
		System.out.println("+---------------Question 9----------------+");

		Department[] depart = new Department[] { dpart1, dpart2, dpart3 };
		if (depart == null) {
			System.out.println("Department null");
		} else {
			for (Department dpm : depart) {
				System.out.println("Departmenr ID : " + dpm.id);
				System.out.println("Departmenr Name : " + dpm.name);
				System.out.println("+++++++++++++++++++++++++++++++++++");
			}
		}

		// +------------------ FOR ----------------+
		// +------------------ Question 10 ----------------+
		System.out.println("+---------------Question 10----------------+");

		for (int i = 0; i < inforaccount.length; i++) {
			System.out.println("thong tin account thu " + (i + 1) + " la :");
			System.out.println("Email: " + inforaccount[i].email);
			System.out.println("Full name: " + inforaccount[i].fullname);
			System.out.println("Phong ban: " + inforaccount[i].department.name);
			System.out.println("+++++++++++++++++++++++++++++++++++");
		}

		// +------------------ Question 11 ----------------+
		System.out.println("+---------------Question 11----------------+");

		for (int i = 0; i < depart.length; i++) {
			System.out.println("thong tin department thu " + (i + 1) + " la :");
			System.out.println("ID: " + depart[i].id);
			System.out.println("Name: " + depart[i].name);
			System.out.println("+++++++++++++++++++++++++++++++++++");

		}

		// +------------------ Question 12 ----------------+
		System.out.println("+---------------Question 12----------------+");

		for (int i = 0; i <= 1; i++) {
			System.out.println("thong tin department thu " + (i + 1) + " la :");
			System.out.println("ID: " + depart[i].id);
			System.out.println("Name: " + depart[i].name);
			System.out.println("+++++++++++++++++++++++++++++++++++");

		}

		// +------------------ Question 13 ----------------+
		System.out.println("+---------------Question 13----------------+");

		for (int i = 0; i < inforaccount.length; i++) {
			if (i != 1) {
				System.out.println("thong tin account thu " + (i + 1) + " la :");
				System.out.println("Email: " + inforaccount[i].email);
				System.out.println("Full name: " + inforaccount[i].fullname);
				System.out.println("Phong ban: " + inforaccount[i].department.name);
				System.out.println("+++++++++++++++++++++++++++++++++++");
			}

		}

		// +------------------ Question 14 ----------------+
		System.out.println("+---------------Question 14----------------+");

		for (int i = 0; i < inforaccount.length; i++) {
			if (i > 1) {
				System.out.println("thong tin account thu " + (i + 1) + " la :");
				System.out.println("Email: " + inforaccount[i].email);
				System.out.println("Full name: " + inforaccount[i].fullname);
				System.out.println("Phong ban: " + inforaccount[i].department.name);
				System.out.println("+++++++++++++++++++++++++++++++++++");
			}

		}

		// +------------------ Question 15 ----------------+
		System.out.println("+---------------Question 15----------------+");
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0)
				System.out.println(i);

		}

		// +------------------ WHILE ----------------+
		// +------------------ Question 16 ----------------+
		System.out.println("+---------------Question 16----------------+");
		int i = 0;
		if (inforaccount == null) {
			System.out.println("Account null");
		} else {
			while (i < inforaccount.length) {
				System.out.println("thong tin account thu " + (i + 1) + " la :");
				System.out.println("email : " + inforaccount[i].email);
				System.out.println("FullName : " + inforaccount[i].fullname);
				System.out.println("department : " + inforaccount[i].department);
				System.out.println("+++++++++++++++++++++++++++++++++++");
				i++;
			}
		}
		// +------------------ Question 16-1 ----------------+
		System.out.println("+---------------Question 16-1 ---------------+");
		int i1 = 0;
		if (depart == null) {
			System.out.println("Department null");
		} else {
			while (i1 < depart.length) {
				System.out.println("thong tin department thu " + (i1 + 1) + " la :");
				System.out.println("ID: " + depart[i1].id);
				System.out.println("Name: " + depart[i1].name);
				System.out.println("+++++++++++++++++++++++++++++++++++");
				i1++;
			}
		}

		// +------------------ Question 16-2 ----------------+
		System.out.println("+---------------Question 16-2 ---------------+");
		int i2 = 0;
		if (depart == null) {
			System.out.println("Department null");
		} else {
			while (i2 < depart.length) {
				if (i2 <= 1) {
					System.out.println("thong tin department thu " + (i2 + 1) + " la :");
					System.out.println("ID: " + depart[i2].id);
					System.out.println("Name: " + depart[i2].name);
					System.out.println("+++++++++++++++++++++++++++++++++++");
				}

				i2++;
			}
		}

		// +------------------ Question 16-3 ----------------+
		System.out.println("+---------------Question 16-3 ---------------+");
		int iac = 0;
		while (iac < inforaccount.length) {
			if (iac != 1) {
				System.out.println("thong tin account thu " + (iac + 1) + " la :");
				System.out.println("email : " + inforaccount[iac].email);
				System.out.println("FullName : " + inforaccount[iac].fullname);
				System.out.println("department : " + inforaccount[iac].department);
				System.out.println("+++++++++++++++++++++++++++++++++++");
			}
			iac++;
		}

		// +------------------ Question 16-4 ----------------+
		System.out.println("+---------------Question 16-4 ---------------+");
		int iac1 = 0;
		while (iac1 < inforaccount.length) {

			if (inforaccount[iac1].id != 1) {
				System.out.println("thong tin account thu " + (iac1 + 1) + " la :");
				System.out.println("email : " + inforaccount[iac1].email);
				System.out.println("FullName : " + inforaccount[iac1].fullname);
				System.out.println("department : " + inforaccount[iac1].department);
				System.out.println("+++++++++++++++++++++++++++++++++++");
			}
			iac1++;
		}
		// +------------------ DO-WHILE ----------------+
		// +------------------ Question 17-1 ----------------+
		System.out.println("+---------------Question 17-1 ---------------+");

		int ac = 0;
		do {
			System.out.println("thong tin account thu " + (ac + 1) + " la :");
			System.out.println("email : " + inforaccount[ac].email);
			System.out.println("FullName : " + inforaccount[ac].fullname);
			System.out.println("department : " + inforaccount[ac].department);
			System.out.println("+++++++++++++++++++++++++++++++++++");
			ac++;
		} while (ac < inforaccount.length);

	}

}
