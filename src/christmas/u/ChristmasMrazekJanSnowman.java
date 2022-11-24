package christmas.u;

public class ChristmasMrazekJanSnowman {

    public int Height;

    public int Width;

    public static final String ANSI_RED = "\u001B[31m";

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_BLACK = "\u001B[30m";


    public void DrawCircle(int circleCount) {

        String gap = "";
        boolean isHead = true;
        String line = "";
        String charToPrint = "█";
        String tempGap = "";
        int eyesWidth = Width / 10;
        int eyesGap = eyesWidth / 2;

        if(Width % 2 == 0){
            Width++;
        }
        boolean x = true;

        for(int i = 0; i < circleCount + 1; i++){
            gap += " ";
        }

        for (int k = 0; k < circleCount; k++)
        {
            for (int i = 0; i < Height; i++)
            {

                if(i == 1 && isHead){
                    tempGap = gap;
                    gap = "";

                    for(int j = 0; j < circleCount; j++){
                        gap += " ";
                    }
                }
                line += gap;
                for (int j = 0; j < Width; j++)
                {
                    if(isHead)
                    {
                        if(x){
                            line+= " ";
                            x = false;
                        }
                        if(i == 0)
                        {
                             if(j < Width - 2){
                                 line += ANSI_RED + charToPrint + ANSI_RESET;
                             }

                             else {
                                 line += "";
                             }
                        }

                        else if (i == 1){

                            if(j == 0){
                                line += ANSI_RED + charToPrint + ANSI_RESET + ANSI_RED + charToPrint + ANSI_RESET + ANSI_RED + charToPrint + ANSI_RESET;
                                gap = tempGap;

                            }
                            else{
                                line += ANSI_RED + charToPrint + ANSI_RESET;
                            }
                        }

                        else if (i == Height -2){
                            if(j == 1 || j == Width - 2){
                                line += ANSI_BLACK + charToPrint + ANSI_RESET;
                            }
                            else{
                                line += charToPrint;
                            }
                        }


                        else if (i == Height / 2 && j == Width / 2){
                            line += ANSI_RED + charToPrint + ANSI_RESET;
                        }

                        else if(i < Height / 2 ){
                            if(j == Width / 2 + eyesWidth + eyesGap ||j == Width / 2 - eyesWidth - eyesGap){
                                line += ANSI_BLACK + charToPrint + ANSI_RESET;
                            }
                            else{
                                line += charToPrint;
                            }
                        }

                        else if (i == Height - 1){
                            if(j == 0 || j== 1 || j == Width -1 || j == Width - 2) {
                                line += charToPrint;
                            }
                            else{
                                line += ANSI_BLACK + charToPrint + ANSI_RESET;
                            }
                        }

                        else{
                            line += charToPrint;
                        }
                    }
                    else if ((j == Width - 1 && i == 0) || (i == 0 && j == 0) || (i == Height - 1 && j == 0) || (i == Height - 1 && j == Width - 1))
                    {
                        line += " ";
                    }
                    else
                    {
                        line += charToPrint ;
                    }
                }

                System.out.println(line);
                line = "";
            }
            isHead = false;

            gap = "";
            for(int i = 0; i < circleCount -k; i++){
                gap += " ";
            }

            Width += 2;
            Height += 1;
        }
    }
}