package java8demo.lxy.stream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * @Title: Demo1 <br />
 * @Description: Stream 基本语法demo <br />
 * <br />
 * @author: Soar <br />
 */
public class Demo1 {
	
	public static void main(String[] args) throws IOException {
			String content = new String(Files.readAllBytes(Paths.get("GoodTime.txt")),StandardCharsets.UTF_8);
			List<String> words = Arrays.asList(content.split("[\\P{L}]+"));//以非字母为分隔符
			System.out.println(words);
			
			/**
			 * java7 写法
			 */
			int count = 0;
			for (String w : words) {
				if(w.length() >= 5 ){
					count++;
				}
			}
			System.out.println(count);
			
			/**
			 * java8 Stream 写法
			 */
			Stream<String> sumStream = words.stream().filter(w -> w.length() >= 5);
			long sum = words.stream().filter(w -> w.length() >= 5).count();
			long sum2 = words.parallelStream().filter(w -> w.length() >= 5).count();//并行
			System.out.println(sum);
			System.out.println(sum2);
			
	}
}
