package com.bytelegend;

import static com.github.hcsp.test.helper.ProjectSourceFileReader.readAsString;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileContent = readAsString(Main.class).replaceAll("\\s", "");
        for (int i = 0; i < 10000; ++i) {
            calculate(i, fileContent);
        }
    }

    public static String calculate(int i, String fileContent) throws IOException {
        // Please set a condition breakpoint with "i==5000" here to capture the value of result
        String result = DigestUtils.md5Hex(fileContent + i);
        return result;
    }
}
