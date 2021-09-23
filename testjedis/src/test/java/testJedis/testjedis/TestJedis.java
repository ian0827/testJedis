package testJedis.testjedis;

import redis.clients.jedis.Jedis;

public class TestJedis {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		jedis.set("foo", "bar");
		String value = jedis.get("foo");
		System.out.print(value);
	}

}
