package at.campus02.nowa.figures;

import java.util.Arrays;

public abstract class Figure {
    protected char[][] symbol = new char[3][3];
    protected int size;


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
//        for (int x = 0; x < size; x++) {
        for (int row = 0; row < 3; row++) {

            for (int p = 0; p < size; p++) {
                for (int col = 0; col < 3; col++) {
                    for (int i = 0; i < size; i++) {
                        sb.append(symbol[col][row]);

                    }
                }
                sb.append('\n');
            }

//                for (int col = 0; col < 3; col++) {
//
//                    sb.append(symbol[col][row]);
//
//                }
//
//                } sb.append('\n');


        }return sb.toString();
    }
    }





//            } else if (size == 2) {
//                for (int col = 0; col < 3; col++) {
//                    sb.append(symbol[col][row]);
//                    sb.append(symbol[col][row]);
//
//                }
//                sb.append('\n');
//                for (int col = 0; col < 3; col++) {
//                    sb.append(symbol[col][row]);
//                    sb.append(symbol[col][row]);
//
//                }
//                sb.append('\n');
//            }
//            else if (size==3){
//                for (int col = 0; col < 3; col++) {
//                    sb.append(symbol[col][row]);
//                    sb.append(symbol[col][row]);
//                    sb.append(symbol[col][row]);
//
//                }
//                sb.append('\n');
//                for (int col = 0; col < 3; col++) {
//                    sb.append(symbol[col][row]);
//                    sb.append(symbol[col][row]);
//                    sb.append(symbol[col][row]);
//
//                }
//                sb.append('\n');
//                for (int col = 0; col < 3; col++) {
//                    sb.append(symbol[col][row]);
//                    sb.append(symbol[col][row]);
//                    sb.append(symbol[col][row]);
//
//                }
//                sb.append('\n');
//
//            }



