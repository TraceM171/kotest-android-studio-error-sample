package com.vulture.kotesttestold

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe


class KotestTest: FunSpec({
    test("test") {
        Testing(1)
        1 shouldBe 1
    }
})