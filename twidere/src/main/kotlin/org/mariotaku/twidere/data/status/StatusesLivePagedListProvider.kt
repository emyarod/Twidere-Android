/*
 *             Twidere - Twitter client for Android
 *
 *  Copyright (C) 2012-2017 Mariotaku Lee <mariotaku.lee@gmail.com>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.mariotaku.twidere.data.status


import android.arch.paging.LivePagedListProvider
import android.content.Context
import org.mariotaku.twidere.data.fetcher.StatusesFetcher
import org.mariotaku.twidere.model.ParcelableStatus
import org.mariotaku.twidere.model.UserKey
import org.mariotaku.twidere.model.pagination.Pagination
import org.mariotaku.twidere.model.timeline.TimelineFilter

class StatusesLivePagedListProvider(
        private val context: Context,
        private val fetcher: StatusesFetcher,
        private val accountKey: UserKey,
        private val timelineFilter: TimelineFilter?
) : LivePagedListProvider<Pagination, ParcelableStatus>() {

    override fun createDataSource() = StatusesDataSource(context, fetcher, accountKey, timelineFilter)

}
