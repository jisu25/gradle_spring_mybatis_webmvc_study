package gradle_spring_mybatis_webmvc_sutdy.mapper;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import gradle_spring_mybatis_webmvc_sutdy.dto.Member;

@Component
public interface MemberMapper {

	ArrayList<Member> selectMemberAll();
	Member selectMemberByEmail(Member member);
	
	int insertMember(Member member);
	int updateMember(Member member);
	int deleteMember(Member member);
	
}
