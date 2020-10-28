package gradle_spring_mybatis_webmvc_sutdy.mapper;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import gradle_spring_mybatis_webmvc_sutdy.config.ControllerConfig;
import gradle_spring_mybatis_webmvc_sutdy.dto.Member;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ControllerConfig.class})
public class MemberMapperTest {

	protected static final Log log= LogFactory.getLog(MemberMapperTest.class);
	
	@Autowired
	private MemberMapper mapper;
	
	@After
	public void tearDown() throws Exception {
	   System.out.println();
	}
	
	@Test
	public void test01SelectMemberAll() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		ArrayList<Member> list = mapper.selectMemberAll();
		Assert.assertNotNull(list);
		list.stream().forEach(System.out::println);
	}
	
	
	@Test
	public void test02SelectMemberByEmail() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Member findMem = new Member();
		findMem.setEmail("test@test.co.kr");
		Member member = mapper.selectMemberByEmail(findMem);
		Assert.assertNotNull(member);
		System.out.println(member);
	}
	
	@Test
	public void test03InsertMember() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Member member = new Member("banana@banana.co.kr", "1234", "바나나", LocalDateTime.now());
		int res = mapper.insertMember(member);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test04UpdateMember() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Member member = new Member("banana@banana.co.kr", "4321", "바나놔", LocalDateTime.now());
		int res = mapper.updateMember(member);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test05DeleteMember() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Member member = new Member();
		member.setEmail("banana@banana.co.kr");
		int res = mapper.deleteMember(member);
		Assert.assertEquals(1, res);
	}

}
