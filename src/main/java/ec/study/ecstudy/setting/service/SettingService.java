package ec.study.ecstudy.setting.service;

import ec.study.ecstudy.setting.domain.Setting;
import ec.study.ecstudy.setting.domain.repository.SettingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SettingService {

    private SettingRepository settingRepository;

    public Setting save(Setting setting){
        return settingRepository.save(setting);
    }
}
