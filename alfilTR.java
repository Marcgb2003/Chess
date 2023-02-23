		Scanner s21 = new Scanner(System.in);
                char tablero [][]= new char [9][9];
                System.out.println("Posicion del alfil de la a-h");
                String posicionl = s21.next();
                int posicionln = 0;
                System.out.println("Posicion del alfil de la 1-8");
                int posicionn = s21.nextInt();
                posicionn = 9-posicionn;
                int ascii = 97;
                int contador21 = 1;
                for(int x = 1; x<tablero.length;x++){
                    tablero[x][0]=(char)ascii;
                    ascii++;
                }
                for(int y = 1; y<tablero.length;y++){
                    if(y==1){
                        tablero[0][y]='8';
                    }
                    else if(y==2){
                        tablero[0][y]='7';
                    }
                    else if(y==3){
                        tablero[0][y]='6';
                    }
                    else if(y==4){
                        tablero[0][y]='5';
                    }
                    else if(y==5){
                        tablero[0][y]='4';
                    }
                    else if(y==6){
                        tablero[0][y]='3';
                    }
                    else if(y==7){
                        tablero[0][y]='2';
                    }
                    else if(y==8){
                        tablero[0][y]='1';
                    }
                }
                for(int y = 1; y<tablero.length;y++){
                    for(int x = 1; x<tablero.length;x++){
                        tablero[x][y]='O';
                    }
                }
                if(posicionl.equals("a")){
                    posicionln=1;
                    tablero[posicionln][posicionn]='A';
                }
                else if(posicionl.equals("b")){
                    posicionln=2;
                    tablero[posicionln][posicionn]='A';
                }
                else if(posicionl.equals("c")){
                    posicionln=3;
                    tablero[posicionln][posicionn]='A';
                }
                else if(posicionl.equals("d")){
                    posicionln=4;
                    tablero[posicionln][posicionn]='A';
                } 
                else if(posicionl.equals("e")){
                    posicionln=5;
                    tablero[posicionln][posicionn]='A';
                }
                else if(posicionl.equals("f")){
                    posicionln=6;
                    tablero[posicionln][posicionn]='A';
                }
                else if(posicionl.equals("g")){
                    posicionln=7;
                    tablero[posicionln][posicionn]='A';
                }
                else if(posicionl.equals("h")){
                    posicionln=8;
                    tablero[posicionln][posicionn]='A';
                }
                for(int y = 0; y<tablero.length;y++){
                    for(int x = 0; x<tablero.length;x++){
                        System.out.print(tablero[x][y]+"\t");
                    }
                    System.out.print("\n");
                }
                int posicionlnv=posicionln+1;
                int posicionnv=posicionn+1;
                if(posicionlnv<8&&posicionnv<8){
                    while(tablero[posicionlnv][posicionnv]=='O'){
                    tablero[posicionlnv][posicionnv]='M';
                    posicionlnv++;
                    posicionnv++;
                    if(posicionnv==8||posicionlnv==8){
                        tablero[posicionlnv][posicionnv]='M';
                        break;
                    }
                    else if(posicionnv>8||posicionlnv>8){
                        break;
                    }
                    }
                }
                System.out.print("\n");
                posicionlnv=posicionln-1;
                posicionnv=posicionn-1;
                if(posicionlnv>1&&posicionnv>1){
                    while(tablero[posicionlnv][posicionnv]=='O'){
                    tablero[posicionlnv][posicionnv]='M';
                    posicionlnv--;
                    posicionnv--;
                    if(posicionnv==1||posicionlnv==1){
                        tablero[posicionlnv][posicionnv]='M';
                        break;
                    }
                    else if(posicionnv<1||posicionlnv<1){
                        break;
                    }
                    }
                }
                posicionlnv=posicionln+1;
                posicionnv=posicionn-1;
                if(posicionlnv<8&&posicionnv>1){
                    while(tablero[posicionlnv][posicionnv]=='O'){
                    tablero[posicionlnv][posicionnv]='M';
                    posicionlnv++;
                    posicionnv--;
                    if(posicionnv==1||posicionlnv==8){
                        tablero[posicionlnv][posicionnv]='M';
                        break;
                    }
                    else if(posicionnv>8||posicionlnv<1){
                        break;
                    }
                    }
                }
                posicionlnv=posicionln-1;
                posicionnv=posicionn+1;
                if(posicionlnv>1&&posicionnv<8){
                    while(tablero[posicionlnv][posicionnv]=='O'){
                    tablero[posicionlnv][posicionnv]='M';
                    posicionlnv--;
                    posicionnv++;
                    if(posicionnv==8||posicionlnv==1){
                        tablero[posicionlnv][posicionnv]='M';
                        break;
