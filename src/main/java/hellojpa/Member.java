package hellojpa;

import javax.persistence.*;

@Entity(name = "Member")    // name 은 default 로 class 이름으로 지정됨
//@Table(name = "MBR")    // 테이블명을 쿼리 실행시 MBR 로 보이게 함
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name="name", nullable = false)
    private String username;

    public Member() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
