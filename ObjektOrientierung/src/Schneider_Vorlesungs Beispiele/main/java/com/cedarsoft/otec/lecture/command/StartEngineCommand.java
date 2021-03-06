/**
 * Licensed under the GNU General Public License version 2 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.gnu.org/licenses/gpl-2.0.txt
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.cedarsoft.otec.lecture.command;

/**
 * @author Johannes Schneider (<a href="mailto:js@cedarsoft.com">js@cedarsoft.com</a>)
 */
public class StartEngineCommand implements Command {

  private boolean oldEngineRunning;
  private final Car car;

  public StartEngineCommand( Car car ) {
    this.car = car;
  }

  @Override
  public void execute() {
    oldEngineRunning = car.isEngineRunning();
    car.startEngine();
  }

  @Override
  public void undo() {
    if ( !oldEngineRunning ) {
      car.stopEngine();
    }
  }
}
