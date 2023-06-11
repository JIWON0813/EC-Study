package ec.study.ecstudy.setting.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "setting")
@Table(name = "setting")
public class Setting { // 사용자정보 테이블
    @Id
    private String empNo; // 사번
    private String viewMode; // 화면모드 all / team / my
    private String permanship; //글씨체
    private String bgColor; // 화면 배경색
    private String holidayTerm; // 경조사 기간표시
}