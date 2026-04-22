package at.asitplus.wallet.cor

import de.infix.testBalloon.framework.core.TestSession

class ModuleTestSession : TestSession() {
    init {
        Initializer.initWithVCK()
    }
}
