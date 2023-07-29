/*
 * Copyright (C) 2023  Andrew Gunnerson
 *
 * This file is part of Custota.
 *
 * Custota is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3
 * as published by the Free Software Foundation.
 *
 * Custota is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Custota.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.chiller3.custota.wrapper

import android.annotation.SuppressLint

object SystemPropertiesProxy {
    @SuppressLint("PrivateApi")
    private val CLS = Class.forName("android.os.SystemProperties")

    private val METHOD_GET = CLS.getDeclaredMethod("get", String::class.java)

    fun get(key: String): String {
        return METHOD_GET.invoke(null, key) as String
    }
}
