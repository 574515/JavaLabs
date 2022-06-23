/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv5;

import ferit.hr.lv5_2.assignment1Cat;
import ferit.hr.lv5_2.assignment1Dog;

/*
    2) Razdvojite klasu Sisavac i klase Pas i Macka u razlicite Java pakete. Pokazite razliku u naslijedjivanju sa
    „protected“ pristupnim modifokatorom (pokazite kako on utjece na pristup varijablama kada je naslijedjena klasa
    u drugom paketu).
*/

public class assignment1Test {    
    public static void main(String[] args) {
        assignment1Mammal mammal = new assignment1Mammal();        
        new assignment1Cat(5, 12.4, "perzijska").describeMe();
        new assignment1Dog(3, 22.3, "zlatni retriver").describeMe();
    }    
}
