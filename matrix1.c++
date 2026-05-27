#include<iostream>
Using namespace std;
int main(){
    int rows,cols;
    cin>>rows>>cols;
    int matrix[20][20];
    for(int i =0;i<rows;i++){
        for(int j=0;j<cols;j++){
            cin>>matrix[i][j];
        }
    }
    int sum=-1;
    int delRow=0;
    for(int i=0;i<rows;i++){
        int rowSum=0;
        for(int j=0;j<cols;j++){
            rowSum+=matrix[i][j];
        }
        if(sum==-1||rowSum<sum){
            sum=rowSum;
            delRow=i;
        }
    }

    int insetType, insertIndex;
    cin>>insertType>>insertIndex;
    int newMatrix[20][20];
    if(insertType==0){
        int newRow[20];
        for(int j=0;j<cols;j++){
            cin>>newRow[j];
        }
        int oldRow=0;
        for(int i=0;i<rows+1;i++){
            if(i==insertIndex){
                for(int j=0;j<cols;j++){
                    newMatrix[i][j]=newRow[j];
                }
            }else{
                for(int j=0;j<cols;j++){
                    newMatrix[i][j]=matrix[oldRow][j];
                }
                oldRow++;
            }
        }
        rows++;
    }else{
        int newCol[20];
        for(int i=0;i<rows;i++){
            cin>>newCol[i];
        }
        int oldCol=0;
        for(int j=0;j<cols+1;j++){
            if(j==insertIndex){
                for(int i=0;i<rows;i++){
                    newMatrix[i][j]=newCol[i];
                }
            }else{
                for(int i=0;i<rows;i++){
                    newMatrix[i][j]=matrix[i][oldCol];
                }
                oldCol++;
            }
        }
        cols++;
    }
}