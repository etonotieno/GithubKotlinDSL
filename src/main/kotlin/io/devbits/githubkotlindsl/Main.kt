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

fun main() {

    val repo = repo {
        repoName = "News-Feed"
        description = "Sample App"
        stars = 4
        //TODO: Figure out how to allow only one owner block per repo
        owner {
            name = "Eton Otieno"
            url = "https://github.com/TheCodingWarlock"
        }
        contributor {
            contributorName = "Juma Allan"
            contributions = 4
        }
        contributor {
            contributorName = "Seth Omari"
            contributions = 5
        }
    }

    println(repo)
}