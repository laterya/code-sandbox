package com.yp.codesandbox.codesand;

import com.yp.codesandbox.model.ExecuteCodeRequest;
import com.yp.codesandbox.model.ExecuteCodeResponse;

/**
 * @author yp
 * @date: 2024/3/3
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

