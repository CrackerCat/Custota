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

#pragma once

#include <sepol/handle.h>
#include <sepol/policydb/policydb.h>

#ifdef __cplusplus
extern "C" {
#endif

int policydb_index_decls_wrapper(sepol_handle_t *handle, policydb_t *p);

#ifdef __cplusplus
}
#endif
