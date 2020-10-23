package hashtable;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import main.MyHashMap;

public class HashMapTest {

	@Test
	public void returnWordFrequencyFromGivenSentence() {
		String sentence = "To be or not to be";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myHashMap.add(word, value);
		}
		int frequency = myHashMap.get("be");
		System.out.println(myHashMap);
		Assert.assertEquals(1, frequency);

	}
}


