package zero.hello.boot.spring5boot.dao;

import zero.hello.boot.spring5boot.model.Member;
import zero.hello.boot.spring5boot.model.Zipcode;

import java.util.List;

public interface MemberDAO {

    int insertMember(Member m);

    List<Member> selectMember();

    List<Zipcode> selectzip(String dong);
}
