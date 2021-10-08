package co.lsj.prj;

import java.util.ArrayList;
import java.util.List;

import co.lsj.prj.exe.MainMenu;
import co.lsj.prj.service.MemberService;
import co.lsj.prj.service.MemberVO;
import co.lsj.prj.serviceImpl.MemberServiceImpl;

public class MainApp {
	
	public static void main(String[] args) {
//		DataSource dao = DataSource.getInstance(); //인스턴스 가져오는것, 싱글톤 dao
//		dao.getConnection(); //연결객체 호출
//		
//		System.out.println("Hello !!!");
//		MemberService memberService = new MemberServiceImpl();
//		List<MemberVO> members = new ArrayList<MemberVO>(); 
		
		
//		//한명 조회
//		MemberVO vo = new MemberVO();
//		vo.setId("lsj");
//		vo = memberService.selectMember(vo);
//		vo.toString();
//		System.out.println("======================");

//		//insert
//		MemberVO vo= new MemberVO();
//		vo.setId("kim");
//		vo.setPassword("4567");
//		vo.setName("김치국");
//		vo.setTel(null);
//		vo.setAddress(null);
//		vo.setAuthor("USER");
//		int n = memberService.insertMember(vo);
//		if(n!=0) {
//			System.out.println("잘 입력되었습니다.");
//		}else {
//			System.out.println("입력 실패했습니다.");
//		}
//		
//		System.out.println("======================");
//		members = memberService.selectMemberList();
//		for(MemberVO member:members) {
//			member.toString();
//		}
//		
		
		MainMenu mainMenu = new MainMenu();
		mainMenu.run();
		
		
	}
}
