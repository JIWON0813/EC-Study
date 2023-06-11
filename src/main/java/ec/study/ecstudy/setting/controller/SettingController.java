package ec.study.ecstudy.setting.controller;

import ec.study.ecstudy.setting.domain.Setting;
import ec.study.ecstudy.setting.service.SettingService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/setting")
@ApiOperation(value = "설정 컨트롤러" , notes = "설정 관련 컨트롤러")
public class SettingController {

    private SettingService settingService;

    @PostMapping("/save/{empNo}")
    public ResponseEntity save(
            @PathVariable String empNo,
            @RequestBody Setting setting){

        Setting result = settingService.save(setting);
        
        ResponseEntity response = ResponseEntity.ok("");

        return response;
    }
}
