#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int slice, int n) {
    int answer = 0;
    
    if(n%slice == 0) {
    	answer = n/slice;
    }else if(n%slice > 0) {
    	answer = (n/slice)+1;
    }
    
    return answer;
	
}