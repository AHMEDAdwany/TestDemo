package com.promineotech;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;

import org.junit.jupiter.params.provider.MethodSource;

import com.prominetech.TestDemo;
import  java.util.stream.Stream;






class TestDemoJUnitTest {

	private TestDemo testDemo; 
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		testDemo= new TestDemo();
	}

	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
	
	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) {
		if(!expectException) {

			  assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
		}
		else { 
			assertThatThrownBy(() ->

		    testDemo.addPositive(a, b))

		        .isInstanceOf(IllegalArgumentException.class); 

}

			}


	
	public static Stream<Arguments> argumentsForAddPositive() {
		return Stream.of(
				Arguments.arguments(2, 4, 6, false),
				Arguments.arguments(2, 8, 10, false),
				Arguments.arguments(2, -1, 1, true),
				Arguments.arguments(-2, 5, 3, true),
				Arguments.arguments(-5, 5, 0, true),
				Arguments.arguments(6, -6, 0, true),
			
				Arguments.arguments(2, -5, -3, true),
				Arguments.arguments(-11, 10, -1, true)				
										
				);
	}

	 @Test
	@Disabled
	void assertThatNumberSquaredIsCorrect() {
		 TestDemo mockDemo = spy(testDemo);
		
		 doReturn(5).when(mockDemo).getRandomInt();
		 
		 int fiveSquared = mockDemo.randomNumberSquared();
		 //
		 assertThat(fiveSquared).isEqualTo(25);
	 }
	 
	 @Test
	 
	 void  assertThatPairsOfPositiveNumbersAreAddedCorrectly() {
		 
		
		 
		 assertThat(testDemo.addPositive(4,5)).isEqualTo(9);

		 assertThat(testDemo.addPositive(40,50)).isEqualTo(90);


		 
		 
	 }
	 @Test
	
	 void testCalculateAverage() {
	        // Given
	        int[] numbers = { 5, 10, 15, 20 };
	        double expected = 12.5;

	        // When
	        double result = testDemo.calculateAverage(numbers);

	        // Then
	        assertEquals(expected, result);
	    }

	   
	}


