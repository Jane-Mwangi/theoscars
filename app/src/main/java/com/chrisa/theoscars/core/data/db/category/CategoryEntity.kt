/*
 * Copyright 2023 Chris Anderson.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.chrisa.theoscars.core.data.db.category

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import com.chrisa.theoscars.core.data.db.categoryalias.CategoryAliasEntity

@Entity(
    tableName = "category",
    foreignKeys = [
        ForeignKey(
            entity = CategoryAliasEntity::class,
            parentColumns = ["id"],
            childColumns = ["categoryAliasId"],
        ),
    ],
    indices = [
        Index("categoryAliasId"),
    ],
)
data class CategoryEntity(
    @PrimaryKey
    val id: Long,
    val categoryAliasId: Long,
    val name: String,
)
