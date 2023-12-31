package zero.hello.boot.spring5boot.mybatis;

import org.apache.ibatis.annotations.Mapper;
import zero.hello.boot.spring5boot.model.Member;
import zero.hello.boot.spring5boot.model.Zipcode;

import java.util.List;
@Mapper
public interface MemberMapper {
    int insertMember(Member m);
    List<Member> selectMember();
    List<Zipcode> findZipcode(String dong);

}
