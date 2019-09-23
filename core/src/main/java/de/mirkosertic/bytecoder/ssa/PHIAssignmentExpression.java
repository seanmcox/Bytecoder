/*
 * Copyright 2017 Mirko Sertic
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.mirkosertic.bytecoder.ssa;

import de.mirkosertic.bytecoder.core.BytecodeOpcodeAddress;

public class PHIAssignmentExpression extends Expression {

    private final PHIValue phi;

    public PHIAssignmentExpression(final Program aProgram, final BytecodeOpcodeAddress aAddress, final PHIValue aPHI, final Value aValue) {
        super(aProgram, aAddress);
        if (aValue == null) {
            throw new IllegalStateException("Null not allowed");
        }
        phi = aPHI;
        receivesDataFrom(aValue);
    }

    public PHIValue getPhi() {
        return phi;
    }
}