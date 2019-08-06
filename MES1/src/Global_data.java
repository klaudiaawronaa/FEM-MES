import static java.lang.Math.sqrt;


public class Global_data {
    double H; //wysokosc
    double L; //szerokosc
    double nH; //liczba wezlow po H
    double nL; //liczba wezlow po L
    int PointQuantity;
    double gauss[][];
    double points[][];
    double K;
    double c;
    double ro;
    double alfa;
    double initTemp;
    double simTime;
    double dT;
    double ambTemp;

    public Global_data(double data[]){

        this.H = data[0];
        this.L = data[1];
        this.nH = data[2];
        this.nL = data[3];
        this.PointQuantity = (int) data[4]; //bo wczytuje next double
        this.K = data[5];
        this.c = data[6];
        this.ro = data[7];
        this.alfa = data[8];
        this.initTemp = data[9];
        this.simTime = data[10];
        this.dT =data[11];
        this.ambTemp = data[12];


        gauss = new double[2][this.PointQuantity];
        points = new double[this.PointQuantity * this.PointQuantity][2];
        //gauss (pierwszy wiersz to punkty, drugi to wagi

        if (this.PointQuantity == 2) {
            //gauss - punkty
            gauss[0][0] = -1 / (sqrt(3));
            gauss[0][1] = 1 / (sqrt(3));

            //gauss - wagi
            gauss[1][0] = 1;
            gauss[1][1] = 1;

            //POINT 1
            points[0][0] = gauss[0][0];
            points[0][1] = gauss[0][0];

            //POINT 2
            points[1][0] = gauss[0][1];
            points[1][1] = gauss[0][0];

            //POINT 3
            points[2][0] = gauss[0][1];
            points[2][1] = gauss[0][1];

            //POINT 4
            points[3][0] = gauss[0][0];
            points[3][1] = gauss[0][1];
        }

        if (this.PointQuantity == 3) {
            //gauss - punkty
            gauss[0][0] = -0.77;
            gauss[0][1] = 0;
            gauss[0][2] = 0.77;
            //gauss - wagi
            gauss[1][0] = 0.55555556; // waga 5/9
            gauss[1][1] = 0.88888889; //waga 8/9
            gauss[1][2] = 0.55555556;

            //POINT 1
            points[0][0] = gauss[0][0];
            points[0][1] = gauss[0][0];

            //POINT 2
            points[1][0] = gauss[0][1];
            points[1][1] = gauss[0][0];

            //POINT 3
            points[2][0] = gauss[0][2];
            points[2][1] = gauss[0][0];

            //POINT 4
            points[3][0] = gauss[0][0];
            points[3][1] = gauss[0][1];

            //POINT 5
            points[4][0] = gauss[0][1];
            points[4][1] = gauss[0][1];

            //POINT 6
            points[5][0] = gauss[0][2];
            points[5][1] = gauss[0][1];

            //POINT 7
            points[6][0] = gauss[0][0];
            points[6][1] = gauss[0][2];

            //POINT 8
            points[7][0] = gauss[0][1];
            points[7][1] = gauss[0][2];

            //POINT 9
            points[8][0] = gauss[0][2];
            points[8][1] = gauss[0][2];
        }

            /*int g =0;
            int h=0;

            for (int i=0 ; i<points.length; i++)
            { for (int j=0; j<points[0].length; j++)
                {
                    if(j==0) {
                        points[i][j] = gauss[0][h];
                        h++;
                        if((h+1)%this.PointQuantity==0) h = 0;
                    }

                    else {
                        points[i][j] = gauss[0][g];
                        if((i+1)%this.PointQuantity==0) g++;
                    }
                }
            }
           */





    }
}
