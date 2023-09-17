package com.inkslab.inkojbackendjudgeservice.judge.codesandbox;

import com.inkslab.inkojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.inkslab.inkojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
