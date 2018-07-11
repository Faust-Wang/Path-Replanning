/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProOF.gen.codification.Integer;

import ProOF.gen.operator.oLocalMove;
import ProOF.opt.abst.problem.meta.Problem;

/**
 *
 * @author marcio
 */
public class iIntMovInvert extends oLocalMove<Problem, cInteger>{
    @Override
    public String name(){
        return "Invert";
    }
    @Override
    public void local_search(Problem mem, cInteger ind) throws Exception {
        int i = mem.rnd.nextInt(ind.cromo.length);
        ind.cromo[i] = ind.max(i)+ind.min(i) - ind.cromo[i];
    }
};
