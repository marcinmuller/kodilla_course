package com.kodilla.testing.collection;

import org.junit.*;
import org.junit.rules.TestName;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Marcin Muller on 13.07.17.
 */
public class CollectionTestSuite {
    @Rule
    public TestName name = new TestName();
    @Before
    public void before(){
        System.out.println("beginning of "+name.getMethodName());
    }
    @After
    public void after(){
        System.out.println("end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> list=new ArrayList<Integer>();
        OddNumbersExterminator oddNumberExterminator = new OddNumbersExterminator();
        //When
        boolean result = oddNumberExterminator.exterminate(list).isEmpty();
        System.out.println("test: "+name.getMethodName()+" in progress");
        //Then
        Assert.assertTrue(result);

    }
    @Test
    public void testOddNumbersExterminatorNormalListOdd(){
        //Given
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,3,7,13,89));
        OddNumbersExterminator oddNumbersExterminator=new OddNumbersExterminator();
        //when
        boolean result=true;
        System.out.println("test: "+name.getMethodName()+" in progress");
        for(Integer n: oddNumbersExterminator.exterminate(list)){
            if(n%2!=0) result=false;
            if(!list.contains(n)) result=false;
        }
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void testOddNumbersExterminatorNormalListEven(){
        //Given
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,4,16,84,100));
        OddNumbersExterminator oddNumbersExterminator=new OddNumbersExterminator();
        //when
        boolean result=true;
        System.out.println("test: "+name.getMethodName()+" in progress");
        for(Integer n: oddNumbersExterminator.exterminate(list)){
            if(n%2!=0) result=false;
            if(!list.contains(n)) result=false;
        }
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void testOddNumbersExterminatorNormalListAll(){
        //Given
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,9,4,16,24,19,17,116,227));
        OddNumbersExterminator oddNumbersExterminator=new OddNumbersExterminator();
        //when
        boolean result=true;
        System.out.println("test: "+name.getMethodName()+" in progress");
        for(Integer n: oddNumbersExterminator.exterminate(list)){
            if(n%2!=0) result=false;
            if(!list.contains(n)) result=false;
        }
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void testOddNumbersExterminatorNormalListZero(){
        //Given
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        OddNumbersExterminator oddNumbersExterminator=new OddNumbersExterminator();
        //when
        boolean result=true;
        System.out.println("test: "+name.getMethodName()+" in progress");
        for(Integer n: oddNumbersExterminator.exterminate(list)){
            if(n%2!=0) result=false;
        }
        //then
        Assert.assertTrue(result);
    }
    @Test
    public void testOddNumbersExterminatorNormalListTwoTimes(){
        //Given
        ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(2,9,4,16,24,19,17,116,227));
        ArrayList<Integer> list2=new ArrayList<Integer>(Arrays.asList(4,5,7,2,44,58,122,7,36,9,13));

        OddNumbersExterminator oddNumbersExterminator=new OddNumbersExterminator();
        //when
        boolean result=true;
        System.out.println("test: "+name.getMethodName()+" in progress");
        for(Integer n: oddNumbersExterminator.exterminate(list)){
            if(n%2!=0) result=false;
            if(!list.contains(n)) result=false;
        }
        for(Integer n: oddNumbersExterminator.exterminate(list2)){
            if(n%2!=0) result=false;
            if(!list2.contains(n)) result=false;
        }
        //then
        Assert.assertTrue(result);
    }
}