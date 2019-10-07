package com.sungju.point;

public class SchoolMain {
	
	public static void main(String[] args) {
		//출력
		PointDAO dao = new PointDAO();
		PointDTO dto = new PointDTO();
		
		dto = dao.search("power", "vam");
		
		
		System.out.println("번호 : " + dto.getNum());
		System.out.println("이름 : " + dto.getName());
		System.out.println("국어 : " + dto.getKor());
		System.out.println("영어 : " + dto.getEng());
		System.out.println("수학 : " + dto.getMath());
		System.out.println("합계 : " + dto.getTotal());
		System.out.println("평균 : " + dto.getAvr());
		
	}

}
