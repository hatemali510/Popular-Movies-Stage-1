package com.ringkjob.popularmovies;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Magnus Ringkjøb
 * <p/>
 * Creates a movie object.
 * The parcelable part is generated with Android Studio plugin.
 * https://plugins.jetbrains.com/plugin/7332?pr=idea
 */
public class Movie implements Parcelable {
    private static final String DATE_FORMAT = "yyyy-MM-dd";
    private String mOriginalTitle;
    private String mPosterPath;
    private String mOverview;
    private Double mVoteAverage;
    private String mReleaseDate;

    /**
     * Constructor for a movie object
     *
     * @param originalTitle Original title of the movie
     * @param posterPath    Path to the movie poster
     * @param overView      Overview (description) of the movie
     * @param voteAverage   Vote average of the movie
     * @param releaseDate   Release date of the movie
     */
    public Movie(String originalTitle, String posterPath, String overView,
                 Double voteAverage, String releaseDate) {
        setOriginalTitle(originalTitle);
        setPosterPath(posterPath);
        setOverview(overView);
        setVoteAverage(voteAverage);
        setReleaseDate(releaseDate);
    }

    /**
     * Constructor for a movie object
     */
    public Movie() {
    }

    /**
     * Sets the original title of the movie
     *
     * @param originalTitle Original title of the movie
     */
    public void setOriginalTitle(String originalTitle) {
        mOriginalTitle = originalTitle;
    }

    /**
     * Sets the path to the movie poster
     *
     * @param posterPath Path to the movie poster
     */
    public void setPosterPath(String posterPath) {
        mPosterPath = posterPath;
    }

    /**
     * Sets the overview of the movie
     *
     * @param overview Overview (description) of the movie
     */
    public void setOverview(String overview) {
        mOverview = overview;
    }

    /**
     * Sets the vote average of the movie
     *
     * @param voteAverage Vote average of the movie
     */
    public void setVoteAverage(Double voteAverage) {
        mVoteAverage = voteAverage;
    }

    /**
     * Sets the release date of the movie
     *
     * @param releaseDate Release date of the movie
     */
    public void setReleaseDate(String releaseDate) {
        mReleaseDate = releaseDate;
    }

    /**
     * Gets the original title of the movie
     *
     * @return Original title of the movie
     */
    public String getOriginalTitle() {
        return mOriginalTitle;
    }

    /**
     * Returns URL string to where the poster can be loaded
     *
     * @return URL string to where the poster can be loaded
     */
    public String getPosterPath() {
        final String TMDB_POSTER_BASE_URL = "https://image.tmdb.org/t/p/w185";

        return TMDB_POSTER_BASE_URL + mPosterPath;
    }

    /**
     * Gets the TMDb movie description (plot)
     *
     * @return TMDb movie description (plot)
     */
    public String getOverview() {
        return mOverview;
    }

    /**
     * Gets the TMDb vote average score
     *
     * @return TMDb vote average score
     */
    public Double getVoteAverage() {
        return mVoteAverage;
    }

    /**
     * Gets the release date of the movie
     *
     * @return Release date of the movie
     */
    public String getReleaseDate() {
        return mReleaseDate;
    }

    /**
     * Gets the TMDb way of scoring the movie: <score>/10
     *
     * @return TMDb way of scoring the movie: <score>/10
     */
    public String getDetailedVoteAverage() {
        return String.valueOf(getVoteAverage()) + "/10";
    }

    /**
     * Returns the format of the date.
     *
     * @return Format of the date
     */
    public String getDateFormat() {
        return DATE_FORMAT;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mOriginalTitle);
        dest.writeString(mPosterPath);
        dest.writeString(mOverview);
        dest.writeValue(mVoteAverage);
        dest.writeString(mReleaseDate);
    }

    private Movie(Parcel in) {
        mOriginalTitle = in.readString();
        mPosterPath = in.readString();
        mOverview = in.readString();
        mVoteAverage = (Double) in.readValue(Double.class.getClassLoader());
        mReleaseDate = in.readString();
    }

    public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
