/*
 * Nextcloud Android client application
 *
 * @author Andy Scherzinger
 * Copyright (C) 2020 Andy Scherzinger
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.owncloud.android.utils;

import java.io.File;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class FileUtil {
    private static final int EMPTY_LENGTH = 0;

    private FileUtil() {
        // utility class -> private constructor
    }

    public static @NonNull String getFilenameFromPathString(@Nullable String filePath) {
        if (filePath != null && filePath.length() > EMPTY_LENGTH) {
            return new File(filePath).getName();
        } else {
            return "";
        }
    }
}