package ArrayFunction;

public class MyArrayUtils {

	public static void main(String[] args) {
		
	}
//  数组输出
	public static void printArr(int[] array) {
		for(int i:array) {
			System.out.print(i+"\t");
		}
	}
//	根据下标增加元素
	public static int[] addElementByIndex(int[] array,int index,int data) {
		int[] result=new int[array.length+1];
		System.arraycopy(array, 0, result, 0, index);
		result[index]=data;
		System.arraycopy(array, index, result, index+1, array.length-index);
		return result;		
	}
//  数组拼接
	public static int[] arrayAddAll(int[] arrayOne,int[] arrayTwo) {
		int[] result=new int[arrayOne.length+arrayTwo.length];
		System.arraycopy(arrayOne, 0, result, 0, arrayOne.length);
		System.arraycopy(arrayTwo, 0, result, arrayOne.length, arrayTwo.length);
		return result;
	}
//  数组删除下标之后的元素
	public static int[] removeElementFromIndex(int[] array,int index) {
		int[] result=new int[index];
		System.arraycopy(array,0,result,0,index);
		return result;
	}
//	数组根据下标删除单个元素
	public static int[] removeElementByIndex(int[] array,int index) {
		int[] result=new int[array.length-1];
		System.arraycopy(array, 0, result, 0, index);
		System.arraycopy(array, index+1, result, index, array.length-index-1);
		return result;
	}
//  截取数组
	public static int[] subArray(int[] array,int from,int to) {
		int[] result=new int[to-from];
		System.arraycopy(array, from, result, 0, to-from);
		return result;		
	}
//  判断某个元素是否存在,并返回下标，否则返回-1
	public static int jundgeExistence(int[] array,int data) {
		int i=-1;
		for(i=0;i<array.length;i++) {
			if(array[i]==data) {
				break;
			}
		}		
		return i;		
	}

}
