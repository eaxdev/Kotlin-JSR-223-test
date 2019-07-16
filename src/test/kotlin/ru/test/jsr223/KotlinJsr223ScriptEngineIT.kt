package ru.test.jsr223

import org.jetbrains.kotlin.cli.common.environment.setIdeaIoUseFallback
import org.junit.Assert
import org.junit.Test
import javax.script.ScriptEngineManager

class KotlinJsr223LocalScriptEngineIT {

    init {
        setIdeaIoUseFallback()
    }

    @Test
    fun testSimpleEval() {
        val engine = ScriptEngineManager().getEngineByExtension("kts")!!
        val res1 = engine.eval("val x = 1")
        Assert.assertNull(res1)
        val res2 = engine.eval("x + 4")
        Assert.assertEquals(5, res2)
    }
}