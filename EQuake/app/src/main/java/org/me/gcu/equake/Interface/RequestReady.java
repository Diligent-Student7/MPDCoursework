package org.me.gcu.equake.Interface;

import org.me.gcu.equake.Model.EQUAKE;

import java.util.List;

/**
 * Developed by: Michael Adebayo Fatoye
 * Student ID: S1718017
 */
public interface RequestReady {
    void onComplete(List<EQUAKE> loaded);
}
