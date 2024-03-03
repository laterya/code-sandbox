package com.yp.codesandbox.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExecuteCodeRequest {

    /**
     * 多组测试样例
     * 减少调用次数，减少一套代码的编译次数
     */
    private List<String> inputList;

    /**
     * 提交的代码
     */
    private String code;

    /**
     * 提交的语言
     */
    private String language;
}
