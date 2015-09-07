package com.ringkjob.popularmovies;

import android.test.suitebuilder.annotation.SmallTest;

import junit.framework.TestCase;

/**
 * Created by magnus on 24.08.2015.
 */
public class MovieTest extends TestCase {

    @SmallTest
    public void testMovie() throws Exception {
        Movie movieTest = new Movie();

        final String ACTUAL_ORIGINAL_TITLE = "Memento";
        final String ACTUAL_POSTER_PATH = "/fQMSaP88cf1nz4qwuNEEFtazuDM.jpg";
        final String ACTUAL_OVERVIEW = "Suffering short-term memory loss after a head injury, Leonard Shelby embarks on a grim quest to find the lowlife who murdered his wife in this gritty, complex thriller that packs more knots than a hangman's noose. To carry out his plan, Shelby snaps Polaroids of people and places, jotting down contextual notes on the backs of photos to aid in his search and jog his memory. He even tattoos his own body in a desperate bid to remember.";
        final Double ACTUAL_VOTE_AVERAGE = 7.7;
        final String ACTUAL_RELEASE_DATE = " 2001-03-16";

        movieTest.setOriginalTitle(ACTUAL_ORIGINAL_TITLE);
        movieTest.setPosterPath(ACTUAL_POSTER_PATH);
        movieTest.setOverview(ACTUAL_OVERVIEW);
        movieTest.setVoteAverage(ACTUAL_VOTE_AVERAGE);
        movieTest.setReleaseDate(ACTUAL_RELEASE_DATE);


        final String EXPECTED_POSTER_PATH = "https://image.tmdb.org/t/p/w185" + ACTUAL_POSTER_PATH;
        final String EXPECTED_VOTE_AVERAGE_DETAILED = "7.7/10";

        assertEquals(ACTUAL_ORIGINAL_TITLE, movieTest.getOriginalTitle());
        assertEquals(EXPECTED_POSTER_PATH, movieTest.getPosterPath());
        assertEquals(ACTUAL_OVERVIEW, movieTest.getOverview());
        assertEquals(EXPECTED_VOTE_AVERAGE_DETAILED, movieTest.getDetailedVoteAverage());
        assertEquals(ACTUAL_RELEASE_DATE, movieTest.getReleaseDate());
    }
}