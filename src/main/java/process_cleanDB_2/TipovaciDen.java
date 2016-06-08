/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package process_cleanDB_2;

import java.util.ArrayList;
import java.util.List;
import process_cleanDB.CleanBetEvent;

/**
 *
 * @author Janco1
 */
public class TipovaciDen implements Comparable<TipovaciDen> {

        String den;
        List<CleanBetEvent> eventy = new ArrayList<>();

        public TipovaciDen(String den) {
            this.den = den;
        }

        @Override
        public int compareTo(TipovaciDen o) {
            return den.compareTo(o.den);
        }

    }
