#include <iostream>
#include <iomanip>
using namespace std;

class Employee {
private:
    string name;
    double salary;
    double bonus;

public:
    Employee(string empName, double empSalary, double empBonus) {
        name = empName;
        salary = empSalary;
        bonus = empBonus;
    }

    double getTotalSalary() {
        return salary + bonus;
    }

    void printInfo() {
        cout << fixed << setprecision(2);
        cout << "Employee: " << name << endl;
        cout << "Total Salary: $" << getTotalSalary() << endl;
    }
};

int main() {
    string name;
    double salary, bonus;

    // Input from user (Beecrowd format)
    getline(cin, name);
    cin >> salary >> bonus;

    Employee emp(name, salary, bonus);
    emp.printInfo();

    return 0;
}
