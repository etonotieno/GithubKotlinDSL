/*
 *  Copyright (C) 2019 Eton Otieno
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.devbits.githubkotlindsl

import io.devbits.githubkotlindsl.models.Repo

fun main() {

    repo {
        repoName = "News-Feed"
        description = "Sample App"
        stars = 4
        owner {
            "Eton Otieno" url "https://github.com/TheCodingWarlock"
        }
        contributors {
            "Juma Allan" contributions 4
            "Seth Omari" contributions 5
        }
    }.print()
}

private fun Repo.print() = print(this)
