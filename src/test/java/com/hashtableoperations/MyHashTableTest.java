package com.hashtableoperations;

import org.junit.Assert;
import org.junit.Test;

public class MyHashTableTest {

    @Test
    public void givenASentence_WhenWordsAreAddedToList_ShouldReturnWordToFrequency() {
        String sentence = "To be or not to be";
        MyHashTable<String , Integer> myHashTable = new MyHashTable<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myHashTable.get(word);
            if (value == null) value = 1;
            else value = value + 1;
            myHashTable.add(word , value);
        }
        int frequency = myHashTable.get("to");
        System.out.println(myHashTable);
        Assert.assertEquals(2 , frequency);
    }

    @Test
    public void givenALargeSentence_WhenWordsAreAddedToList_ShouldReturnWordParanoidFrequency() {
        String sentence = "Paranoids are not paranoid because they are paranoid but " +
                "because they keep putting themselves deliberately into paranoid avoidable situations";
        MyLinkedHashMap<String , Integer> myLinkedHashMap = new MyLinkedHashMap();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myLinkedHashMap.get(word);
            if (value == null) value = 1;
            else value = value + 1;
            myLinkedHashMap.add(word , value);
        }
        int frequency = myLinkedHashMap.get("paranoid");
        System.out.println(myLinkedHashMap);
        Assert.assertEquals(3 , frequency);
    }
}
