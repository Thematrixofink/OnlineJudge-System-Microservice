package com.inkslab.inkojbackendjudgeservice.judge;

import com.inkslab.inkojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.inkslab.inkojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.inkslab.inkojbackendjudgeservice.judge.strategy.JudgeContext;
import com.inkslab.inkojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.inkslab.inkojbackendmodel.model.codesandbox.JudgeInfo;
import com.inkslab.inkojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
