package com.company.no09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class No09 {

    /*
    try-finally文
    問題点
    ・tryとfinallyブロックの中の両方で例外が発生した場合、finallyブロックの中で発生した例外がスローさレル
     */
    static String firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            br.close();
        }
    }

    /*
    try-with-resource文
    ・finallyブロックでcloseメソッドを呼び出さなくても自動でcloseをしてくれるようになる（ソースが簡潔になり可読性が向上する）
    ・close処理内で例外が発生してもtry文の中の例外がスローされる（本来知りたいはずの例外がスローされる）
     */
    static String firstLineOfFileTWR(String path) throws IOException {
        try(BufferedReader br = new BufferedReader(
                new FileReader(path)
        )) {
            return br.readLine();
        }
    }


}
