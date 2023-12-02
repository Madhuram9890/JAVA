package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Book_list.Bookutil;
import Book_list.List_book;
import Book_list.sortbyname;
import Book_list.sortbyprice;

import static Book_list.List_book.srtbyName;

public class Collection_List {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(50);
		l1.add(40);
		l1.add(10);

		for (int no : l1) {
			System.out.println(no);
		}

		Collections.sort(l1);

		for (int no : l1) {
			System.out.println(no);
		}

		List<List_book> lib = new ArrayList<List_book>();
		lib = Bookutil.getbook();

//		for(List_book bk: lib)
//		{
//			System.out.println(bk);
//		}

		System.out.println("Sorting on id default");
		Collections.sort(lib);

		for (List_book bk : lib) {
			System.out.println(bk);
		}
		System.out.println("--------------------");
		System.out.println("Sorting on price");

		Collections.sort(lib, new sortbyprice());
		for (List_book bk : lib) {
			System.out.println(bk);
		}

		System.out.println("-------------sort name ------------");

		lib.add(new List_book(15, "ANIMAL", "XYZ", 500));
//		
//		Comparator<List_book> p;
//		p= (List_book o1 , List_book o2) -> {
//			if(o1.getBookname().compareTo(o2.getBookname())== 0)
//				return 0;
//			else if(o1.getBookname().compareTo(o2.getBookname()) >0 )
//				return 1;
//			else
//				return -1;
//		};

		Collections.sort(lib, srtbyName);
		for (List_book bk : lib) {
			System.out.println(bk);
		}

		System.out.println("--------------sort by author name-------------------");
		Comparator<List_book> sortbyauthorname = (o1, o2) -> {
			return o1.getAuthname().compareTo(o2.getAuthname());
		};

		Collections.sort(lib, sortbyauthorname);
		for (List_book bk : lib) {
			System.out.println(bk);
		}

	}

}
