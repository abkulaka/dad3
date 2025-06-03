#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    double salario, reajuste, novo_salario;
    int percentual;

    cin >> salario;

    if (salario <= 400.00) {
        percentual = 15;
    } else if (salario <= 800.00) {
        percentual = 12;
    } else if (salario <= 1200.00) {
        percentual = 10;
    } else if (salario <= 2000.00) {
        percentual = 7;
    } else {
        percentual = 4;
    }

    reajuste = salario * percentual / 100.0;
    novo_salario = salario + reajuste;

    cout << fixed << setprecision(2);
    cout << "Novo salario: " << novo_salario << endl;
    cout << "Reajuste ganho: " << reajuste << endl;
    cout << "Em percentual: " << percentual << " %" << endl;

    return 0;
}

